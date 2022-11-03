const arrayOfWords = ['cucumber', 'tomatos', 'avocado'];
const complicatedArray = ['cucumber', 44, true];

const makeAllCaps = async(fruit) => {
    const capitalFruit = fruit.toString().toUpperCase().split(",")
    return capitalFruit
}
    makeAllCaps(arrayOfWords)
    .then(fruit=>fruit.sort())
    .then(result=>console.log(result))
    .catch(err => console.log(err))

    makeAllCaps(complicatedArray)
    .then(fruit=>fruit.sort())
    .then(result=>console.log(result))
    .catch(err => console.log(err))
