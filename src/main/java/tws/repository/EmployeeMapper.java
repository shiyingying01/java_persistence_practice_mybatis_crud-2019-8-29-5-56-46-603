package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import tws.entity.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<Employee> selectAll();

	void addEmployee(Employee employee);

	void updateEmployee(@Param("id") int id ,@Param("employee")Employee employee);

	void deleteEmployee(int id);
}
