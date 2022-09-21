console.log("tugas 2");

let my_bucket_list = [];
my_bucket_list.push("KOMISARIS PERTAMINA");
console.log(my_bucket_list);
document.querySelector("div#pushPertama").innerHTML = '<b> bucket listnya adalah '+my_bucket_list+'</b>';

my_bucket_list.push("DIREKSI MANDIRI");
console.log(my_bucket_list);
document.querySelector("div#pushKedua").innerHTML = '<b> bucket listnya adalah '+my_bucket_list+'</b>';

my_bucket_list.unshift("CEO CIMB GROUP");
console.log(my_bucket_list);
document.querySelector("div#pushKetiga").innerHTML = '<b> bucket listnya adalah '+my_bucket_list+'</b>';

my_bucket_list.pop();
console.log(my_bucket_list);
document.querySelector("div#pushKeempat").innerHTML = '<b> bucket listnya adalah '+my_bucket_list+'</b>';

my_bucket_list.shift();
console.log(my_bucket_list);
document.querySelector("div#pushKelima").innerHTML = '<b> bucket listnya adalah yui'+my_bucket_list+'</b>';