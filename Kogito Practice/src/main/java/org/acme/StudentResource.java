/*
 * package org.acme;
 * 
 * import java.util.List;
 * 
 * 
 * import javax.transaction.Transactional;
 * 
 * import org.acme.model.Student; import
 * org.springframework.web.bind.annotation.DeleteMapping; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.PutMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * @RestController public class StudentResource {
 * 
 * 
 * @PostMapping("/student")
 * 
 * @Transactional public void addStudent(Student student) {
 * Student.persist(student); }
 * 
 * @GetMapping("/student")
 * 
 * public List<Student> getStuednt() { return Student.listAll();
 * 
 * }
 * 
 * @GetMapping("/student/{id}")
 * 
 * public Student getPerson(@PathVariable("id") long id) { return
 * Student.findById(id);
 * 
 * }
 * 
 * @DeleteMapping("/student")
 * 
 * @Transactional public void deletePerson() { Student.deleteAll(); }
 * 
 * @DeleteMapping("/student/{id}")
 * 
 * @Transactional public void deleteStudent(@PathVariable("id") long id) {
 * Student.deleteById(id);
 * 
 * }
 * 
 * @PutMapping("/student/{id}")
 * 
 * @Transactional public void updateStudent(@PathVariable("id") long id) {
 * 
 * Student.update (query: "id", id);
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * }
 */
