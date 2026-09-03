const person = {
  name: "John",
  greet: function() {
    console.log("Hello, my name is " + this.name);
  }
}
person.greet();  

const person={
    name:"abc",
    age:26,
    greet : ()=>{
        console.log("this is a function!!"+this.name);
    }
};
person.greet();