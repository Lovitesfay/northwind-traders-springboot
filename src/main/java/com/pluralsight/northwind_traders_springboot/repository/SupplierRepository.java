package com.pluralsight.northwind_traders_springboot.repository;
import com.pluralsight.northwind_traders_springboot.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository <Supplier, Integer>{
}
