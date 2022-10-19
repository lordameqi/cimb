package id.belajar.springbootthmeyleaf.repository;

import id.belajar.springbootthmeyleaf.entity.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MahasiswaRepository extends JpaRepository<Mahasiswa,String> {

}
