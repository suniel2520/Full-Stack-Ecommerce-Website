package com.webapplication.springbootecommerce.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "product")
@Data

/**
 *    1. lombok dependency :
 * With Lombok, we can replace boiler-plate code with meaningful annotations. They help the developer focus on business logic.
 * Lombok also provides some annotations that combine multiple other annotations (like @Data combines @ToString,
 * @EqualsAndHashCode, @Getter / @Setter, and @RequiredArgsConstructor), so we don’t have to “pollute” our code with too
 * many annotations.
 *
 *    2. CreationTimeStamp  & UpdateTimeStamp :
 *    Hibernate automatically manages the timestamps
 */

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private ProductCategory category;

    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "active")
    private boolean active;

    @Column(name = "units_in_stock")
    private Integer unitsInStock;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date lastUpdated;



}
