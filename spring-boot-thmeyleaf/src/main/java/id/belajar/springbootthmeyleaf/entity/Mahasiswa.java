package id.belajar.springbootthmeyleaf.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Mahasiswa {
    //untuk id
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    //untuk nim
    @NotNull(message = "Nim Wajib Diisi")
    @NotBlank(message = "Nim Tidak Boleh Kosong")
    @Column(unique = true)
    private String nim;

    //untuk nama
    @NotNull(message = "Nama Wajib Diisi")
    @NotBlank(message = "Nama tidak boleh kosong")
    private String nama;

    //ipk
    @NotNull(message = "IPK Wajib Diisi")
    @NotBlank(message = "IPK Wajib DIisi")
    private float ipk;

    //jurusan
    @NotNull(message = "Jurusna wajib Diisi")
    @NotBlank(message = "jurusan tidak boleh kosong")
    private String jurusan;
}
