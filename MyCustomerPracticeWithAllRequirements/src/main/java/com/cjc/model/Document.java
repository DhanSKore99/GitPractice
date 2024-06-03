package com.cjc.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int docId;
	@Lob
	@Column(length =700000)
	private byte[] pancard;

}
