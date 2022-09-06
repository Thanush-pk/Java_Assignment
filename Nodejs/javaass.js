// const fs=require ("fs");
// const path=require('path');
// fs.readFile(path.join(__dirname,'D:\New folder','javaexe.java'),'utf8'
// ,(err,data)=>{
//     if(err)throw err;
//     console.log(data);
// })
const fs = require('fs');

fs.readFile('javaexe.java', 'utf8', (err, data) => {
  if (err) {
    console.error(err);
    return;
  }
  console.log(data);
});
// Asynchronous read
// fs.readFile('D:\nodejs\javaexe.java', function (err, data) {
// if (err) {
// 	return console.error(err);
// }
// console.log("Asynchronous read: " + data.toString());
// });
