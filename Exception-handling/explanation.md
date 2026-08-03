1. try catch block 
2. finally 
3. Aplliaction

why we use try catch and finally block

->we use these things for thr exception handling in java .
-> Exception handling in java is used to prevent a program from crashing when and error occurs during execution.

Syntax 
try{
    code that may occur at the time of exception
}

catch (Exception e){
    // code to handle the exception
}

finally {
    // code that always exceute
}

//finally block -> executes always whether an exception occurs or not 
// why it is used 
/*
1. Close files
2. Accesing the files
3. Release Resource
4. Cleanup Resource
*/

Multiple try catch block 

// throw and throws.

throw -> if you want to create user defined exceptions us 
or

throw manually ie : explicity throw an exception from a method or block of code

throws -> the throws is used to declare that a method may throw one or more exceptions so the calling method is informed that is must handle or further declare  those exceptions.