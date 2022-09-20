let nama = prompt("Masukkan nama anda");
alert("Selamat datang konsumen Tuan "+nama);

let minuman = prompt("Masukkan minuman yg ingin anda pesan");
if (minuman != "jus") {
    
    alert("Siap "+ nama +", satu "+ minuman+" segera datang!");
} else {
    alert("Mohon Maaf, jus tidak tersedia");
}