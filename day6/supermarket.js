var supermanObj = {
    id: "1a2b3c",
    name: "Superman",
    age: 200,
    favorite: [
        "coding",
        "reading",
        {
            sport: [
                [
                    "parkour",
                    "hill climbing",
                ]
            ],
        }
    ],
    
    address: {
        street: "Planet Surf",
        zipcode: 54213
    }
    
};

console.log(supermanObj.name);
console.log(supermanObj.age);
console.log(supermanObj.favorite[0]);
console.log(supermanObj.favorite[2].sport[0]);
console.log(supermanObj.favorite[2].sport[0][0]);
console.log(supermanObj.address);
console.log(supermanObj.address.zipcode)

supermanObj.house="era";
console.log(supermanObj);
