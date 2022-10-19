create table if not exists mahasiswa(
    id varchar(40) not null,
    nim varchar(10) not null unique,
    nama varchar(50) not null,
    ipk float(4,2) not null,
    jurusan varchar(25) not null,
    primary key(id)
)engine= InnoDB