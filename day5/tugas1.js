let recipe = [];

recipe[0] = "air";
recipe[1] = "tepung";
recipe[2] = "beras";
recipe[3] = "rosebrand";
recipe[4] = "dimasak";
let last_step = recipe[5] = "dadakan";

document.querySelector("div#arrayRecipe").innerHTML = '<b> Recipenya adalah '+recipe+'</b>';

console.log("tugas 1");
console.log(recipe[0]);
document.querySelector("div#firstRecipe").innerHTML = '<b> awal Recipenya adalah '+recipe[0]+'</b>';
console.log(last_step);
document.querySelector("div#lastRecipe").innerHTML = '<b> akhir Recipenya adalah '+last_step+'</b>';