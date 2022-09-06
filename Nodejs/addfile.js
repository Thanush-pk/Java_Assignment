const fs=require ("fs");
const path=require('path');
fs.writeFile(path.join(__dirname,'/trainingdetails','student.txt'),'Thanush'
,(err)=>{
    if(err)throw err;
    console.log('student details is written..');
})
//const fs=require ("fs");
//const path=require('path');
fs.readFile(path.join(__dirname,'/trainingdetails','student.txt'),'utf8'
,(err,data)=>{
    if(err)throw err;
    console.log(data);
})