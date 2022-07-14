package com.qa.practicalprojectbackend.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Table
public class Animals {
	


		@Id // PK
		@GeneratedValue(strategy = GenerationType.IDENTITY) // AI
		private Integer id;

		@Column(name = "animalName", nullable = false, unique = true)
		private String name;

		private String group;
		
		private String population;
		
		private String diet;

		private int lifespan;
		

		public Animals() {
			super();
			// REQUIRED
		}


		public Animals(Integer id, String name, String group, String population, String diet, int lifespan) {
			super();
			this.id = id;
			this.name = name;
			this.group = group;
			this.population = population;
			this.diet = diet;
			this.lifespan = lifespan;
		}


		public Animals(String name, String group, String population, String diet, int lifespan) {
			super();
			this.name = name;
			this.group = group;
			this.population = population;
			this.diet = diet;
			this.lifespan = lifespan;
		}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getGroup() {
			return group;
		}


		public void setGroup(String group) {
			this.group = group;
		}


		public String getPopulation() {
			return population;
		}


		public void setPopulation(String population) {
			this.population = population;
		}


		public String getDiet() {
			return diet;
		}


		public void setDiet(String diet) {
			this.diet = diet;
		}


		public int getLifespan() {
			return lifespan;
		}


		public void setLifespan(int lifespan) {
			this.lifespan = lifespan;
		}


		@Override
		public int hashCode() {
			return Objects.hash(diet, group, id, lifespan, name, population);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Animals other = (Animals) obj;
			return Objects.equals(diet, other.diet) && Objects.equals(group, other.group)
					&& Objects.equals(id, other.id) && lifespan == other.lifespan && Objects.equals(name, other.name)
					&& Objects.equals(population, other.population);
		}


		@Override
		public String toString() {
			return "Animals name = " + name + ", group = " + group + ", population = " + population + ", diet = " + diet
					+ ", lifespan = " + lifespan;
		}
		
		

}
