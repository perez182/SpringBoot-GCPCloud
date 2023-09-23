package com.AutosGCP.mx.BodyEntity;

import java.beans.JavaBean;

import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Qualifier
public class BodyEntity {
	Object object;
	String message;
}
