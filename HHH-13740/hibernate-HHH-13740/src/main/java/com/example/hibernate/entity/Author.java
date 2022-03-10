/*
 * Copyright 2019 Evgeniy Khyst
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.hibernate.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Author implements Serializable {

  @Id
  @GeneratedValue
  private Long id;

  @NaturalId
  @EqualsAndHashCode.Include
  private String fullName;

  public Author(String fullName) {
    this.fullName = fullName;
  }
}
