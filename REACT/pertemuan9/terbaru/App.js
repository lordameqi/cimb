import { StatusBar } from 'expo-status-bar';
import React, {useEffect,useState} from 'react';
import { StyleSheet, Text, View, ScrollView, TextInput,Image, FlatList } from 'react-native';

export default function App() {
  // const [input, setInput] = useState('');
  const [usersData,setUsersData]=useState([])
  const getData=()=>{
    fetch('https://randomuser.me/api/?results=10&inc=name,location,email,picture')
    .then(response=>response.json())
    .then(data=>setUsersData(data.results))
  };
  useEffect(() => {
    getData();
    console.log(usersData);
  },[]);

 
console.log(usersData);


  let posts =[]
  // for (let index = 0; index < 10; index++) {
  //     posts.push({
  //       title: `title ${index}`,
  //       description: `Deskripsi untuk title ${index}`
  //     })
    
  // }

  // for (let index = 0; index <= 20; index++) {
  //   posts.push({
  //     title: `Title ${index}`
  //   })
    
  // }
  return (
    <View style={styles.container}>
      {/* <Text style={styles.title}>React Native</Text> */}
      {/* <View  style={styles.box1}/>
      <View  style={styles.box2}/>
      <View  style={styles.box3}/> */}

      {/* <TextInput 
      style={styles.textInput}
      placeholder="Masukkan text disini"
      onChangeText={text=> setInput(text)}
      defaultValue={input}
      />
      <Text style={{padding: 10, fontSize: 25}}>
        the text : {input}
      </Text> */}
      <ScrollView style={styles.scroll}>
        {
         usersData.map((psot, idx) =>(
            // console.log(psot.picture.large)
            <View style={styles.box} key={idx}>
              <Image style={{width:140,height:140}} source={{
                uri: `${psot.picture.large}`
              }}/>
              <Text style={styles.title}>{psot.name.first} {psot.name.last}
              {'\n'}
              {psot.location.street.number} {psot.location.street.name}
              {'\n'}
              <Text style={{color:"red"}}>{psot.email}</Text>
              </Text>
             
           
            </View>
          ))
        }
      </ScrollView>
{/* 
      <FlatList
      data={posts}
      renderItem={({item})=> <Text style={styles.item}>{item.title}</Text>}
      /> */}
    <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    marginTop: 25
    // backgroundColor: "#C68B59",
    // padding: 25
  },
  item: {
    padding: 10,
    fontSize: 20,
    height: 50
  },

  scroll: {
    backgroundColor: "#C2B8A3",
  
    padding: 10
  },
  box: {
    backgroundColor: "#FEF7DC",
    marginBottom: 10,
    flex:1,
    flexDirection: "row",
    padding: 3
  },
  // title: {
  //   fontSize: 4,
    
  // },
  textInput:{
    height: 40
  },

  title: {
    marginTop: 6,
    paddingVertical: 8,
    borderWidth: 2,
    borderColor: "#20232a",
    borderRadius: 6,
    backgroundColor: "#61dafb",
    color: "#20232a",
    textAlign: "center",
    fontSize: 14,
    fontWeight: "bold"
  },

  box1:{
    flex: 1,
    backgroundColor: 'red'
  },
  box2: {
    flex: 2,
    backgroundColor: 'yellow'
  },
  box3: {
    flex: 3,
    backgroundColor: 'green'
  }
});
