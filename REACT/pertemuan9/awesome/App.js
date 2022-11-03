import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, Image, Button } from 'react-native';

export default function App() {
  return (
    <View style={styles.container}>
      <Image 
      style= {styles.image}
      source={{uri: 'https://wallpapertag.com/wallpaper/full/7/c/f/972352-gundam-seed-wallpaper-1920x1261-picture.jpg'}}
      />
      <Text style={styles.text}>{'\n'}Mari kita belajar React Native with HEKTIV hahahaha {`\n`}</Text>
      <Button title='Click Me' color='red'/>
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  image:{
    height: 150,
    width: 150,
    borderRadius: 40,
    overflow: 'hidden'
  },
  text: {
    fontSize: 30,
    textAlign: 'center'
  }
});
