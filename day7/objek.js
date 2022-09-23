let pegawai = {
    namaDepan : "Tony",
    namaBelakang: "Veve",
    getnamaLengkap: function(){
        return this.namaDepan+ " "+ this.namaBelakang;
    }
};
console.log(pegawai.getnamaLengkap());
console.log(pegawai.namaDepan);
console.log(pegawai);
console.log(pegawai.hasOwnProperty("namaTengah"));

pegawai.greeting = function () {
    console.log("hellow " + this.namaBelakang);
}

pegawai.greeting();