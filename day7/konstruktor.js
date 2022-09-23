function Pegawai(namaDepan,namaBelakang) {
    this.namaDepan = namaDepan;
    this.namaBelakang = namaBelakang;

    this.getnamaLengkap = function(){
        return this.namaDepan +" "+this.namaBelakang;
    }
  }


let pegawai2 = new Pegawai("tony","Veve");
console.log(pegawai2);

console.log(pegawai2.getnamaLengkap());
console.log(pegawai2 instanceof Pegawai);
console.log(pegawai2 instanceof Object);
