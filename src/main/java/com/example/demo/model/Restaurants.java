package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString(onlyExplicitlyIncluded = true)
public class Restaurants {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Long id;

  @Column
  private String name;

  @Column(columnDefinition = "text")
  private String documentUrl;

  @Column
  private String address;

  @Column(unique = true)
  @NotNull(message = "Phone number is required")
  @NotEmpty(message = "email must not be empty")
  private String phoneNumber;

  @Column
  private String gstNumber;

  @Column
  private String licienceNumber;

}
