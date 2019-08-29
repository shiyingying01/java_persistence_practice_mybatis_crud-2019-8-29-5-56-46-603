package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import tws.entity.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<Employee> selectAll();

	void addEmployee(Employee employee);

	void updateEmployee(Employee employee);

	void deleteEmployee(int id);
}
