package ar.com.codoacodo.clase8;

import java.time.LocalDate;

public class Products {

	private Long id;
	private String title;
	private Double price;
	private LocalDate createdAt;

	public Products(Long id, String title, Double price, LocalDate createdAt) {
		this.id = id;
		this.title = title;
		this.price = price;
		this.createdAt = createdAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", title=" + title + ", price=" + price + ", createdAt=" + createdAt + "]";
	}
	
	
}
