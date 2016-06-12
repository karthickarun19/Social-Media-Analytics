package chart;

import org.apache.commons.codec.binary.Base64;

public class EncodeDecode {
     public static String decodeUsername(String encodeduserName){
    	byte[] valueDecoded= Base64.decodeBase64(encodeduserName );
 		return new String(valueDecoded);
     }
	
     public static String decodePassword(String encodedpassword){
     	byte[] valueDecoded= Base64.decodeBase64(encodedpassword );
  		return new String(valueDecoded);
      }


}
