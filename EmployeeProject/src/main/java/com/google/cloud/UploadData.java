package com.google.cloud;

import java.io.FileInputStream;



import java.io.IOException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.cloud.storage.Storage.BlobGetOption;

public class UploadData {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String credentialsFile = "/home/sahana/Downloads/acm-mm-staging-spoors-etl.json";  // /My First Project-c60ff91d59f5.json";
		String bucketName ="acm-dp-spoors-mm-staging-source-archive";   //"spoorstest";
		String dataTable = "checkInCheckOut";
		String projectId = "acm-mm-staging"; //"absolute-garden-240714";
		//String blobName =  //"sha256_Agent_"+dataTable+"_"+dataTable+"_"+date+".json";
		 /* GoogleCredentials credentials = GoogleCredentials
				.fromStream(new FileInputStream(credentialsFile));

		Storage storage = StorageOptions.newBuilder().setCredentials(credentials).setProjectId(projectId).build().getService();
		BlobId blobId = BlobId.of(bucketName, blobName);
		BlobInfo blobInfo = BlobInfo.newBuilder(blobId).setContentType("text/plain").build();
		//Blob blob = storage.create(blobInfo, checkInCheckOutJson.getBytes());
		Blob blobData = storage.get(bucketName, blobName, BlobGetOption.fields(Storage.BlobField.values()));
		System.out.println(blobId);
		System.out.println("MediaLink: " + blob.getMediaLink());
		System.out.println("Id: " + blob.getBlobId()); */
	}

}
