 package com.sanidhya.accountManager;

public class UserNotFoundException  extends RuntimeException{
   UserNotFoundException(Long id){
	   super("Sorry !, user could not be found" +id);
   }
}
