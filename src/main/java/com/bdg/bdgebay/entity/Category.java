package com.bdg.bdgebay.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.bdg.bdgebay.common.CategoryType;

@Entity
	@Table(name = "t_category")
	public class Category {

	    @Id
	    @SequenceGenerator(name = "seq_category", sequenceName = "seq_category")
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_category")
	    @Column(name = "id", unique = true, nullable = false, updatable = false)
	    private Long id;

	    @Enumerated(EnumType.STRING)
	    @Column(name = "category_type", nullable = false)
	    private CategoryType categoryType;

	    @Column(name = "created", nullable = false)
	    private LocalDateTime created;

	    @Column(name = "updated", nullable = false)
	    private LocalDateTime updated;

	    @Column(name = "deleted", nullable = true)
	    private LocalDateTime deleted;

	    @PrePersist
	    protected void onCreate() {
	        this.created = LocalDateTime.now();
	        this.updated = this.created;
	    }

	    @PreUpdate
	    protected void onUpdate() {
	        this.updated = LocalDateTime.now();
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public CategoryType getCategoryType() {
	        return categoryType;
	    }

	    public void setCategoryType(CategoryType categoryType) {
	        this.categoryType = categoryType;
	    }

	    public LocalDateTime getCreated() {
	        return created;
	    }

	    public void setCreated(LocalDateTime created) {
	        this.created = created;
	    }

	    public LocalDateTime getUpdated() {
	        return updated;
	    }

	    public void setUpdated(LocalDateTime updated) {
	        this.updated = updated;
	    }

	    public LocalDateTime getDeleted() {
	        return deleted;
	    }

	    public void setDeleted(LocalDateTime deleted) {
	        this.deleted = deleted;
	    }
}
