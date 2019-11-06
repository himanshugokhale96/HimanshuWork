package com.google.cloud;

import java.io.FileInputStream;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
//Imports the Google Cloud client library
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.BucketInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageClass;
import com.google.cloud.storage.StorageOptions;

public class BucketCreation {
	 public static void main(String[] args) throws Exception {
		   
		 // Instantiates a client
		 
		    //Storage storage = StorageOptions.getDefaultInstance().getService();
		 
		 GoogleCredentials credentials = GoogleCredentials.fromStream(new FileInputStream("/home/sahana/Downloads/access.json"));
		    
		    Storage storage = StorageOptions.newBuilder().setCredentials(credentials).build().getService();
		    
		    System.out.println(storage);

		    // The name for the new bucket
		    String bucketName = "sahana";  // "my-new-bucket";
		    
		    // Creates the new bucket
		    Bucket bucket = storage.create(BucketInfo.of(bucketName));

		    System.out.printf("Bucket %s created.%n", bucket.getName()); 
		    
		    //Bucket bucket = storage.create(BucketInfo.newBuilder(bucketName).setStorageClass(StorageClass.MULTI_REGIONAL).setLocation("asia").build()); 
		    /*String bucketName = "my_unique_bucket";
		    String blobName = "my_blob_name";
		    BlobId blobId = BlobId.of(bucketName, blobName);
		    BlobInfo blobInfo = BlobInfo.newBuilder(blobId).setContentType("text/plain").build();
		    Blob blob = storage.create(blobInfo);
		     
		     System.out.println(blob); */
		  }
	
	

}
