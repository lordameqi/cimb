let nilai = prompt("Masukkan nilai diantara 1 - 100");

if (nilai > 0 && nilai <=100) {
    if ((nilai >= 80) && (nilai <= 100)) {
        alert("your grade is A");
    } else if ((nilai >= 60) && (nilai<= 80)) {
        alert("your grade is B");
    } else if ((nilai >= 40) && (nilai <= 60)) {
        alert("your grade is C");
    }else{
        alert("your grade is D");
    }
} else {
    alert("Cannot Calculate your age bizaaa");
}