package com.lucasrodrigues.demo.thymeleaf.domains;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lucasrodrigues.demo.thymeleaf.dto.ProductDTO;
import com.lucasrodrigues.demo.thymeleaf.enums.ProductStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lucas Rodrigues
 * @since 2021/11/05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID id;
	
	@Column(name = "name", nullable = false, length = 255)
	private String name;
	
	@Column(name = "deliverydate", nullable = true, length = 255)
	private LocalDateTime deliveryDate;
	
	@Column(name = "urlimage", nullable = false, length = 255)
	private String urlImage;
	
	@Column(name = "urlproduct", nullable = false, length = 255)
	private String urlProduct;
	
	@Column(name = "description", nullable = true, length = 255)
	private String description;
	
	@Column(name = "value", nullable = false, length = 255)
	private BigDecimal value;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status", nullable = false, length = 255)
	private ProductStatus status;
	
}
