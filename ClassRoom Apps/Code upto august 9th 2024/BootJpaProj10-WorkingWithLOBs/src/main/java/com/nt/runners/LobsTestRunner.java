package com.nt.runners;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.MarriageProfile;
import com.nt.service.IMarriageProfileMgmtService;

@Component
public class LobsTestRunner implements CommandLineRunner {
	@Autowired
	private IMarriageProfileMgmtService  profileService;

	@Override
	public void run(String... args) throws Exception {
		/*		Scanner sc=new Scanner(System.in);
				System.out.println("Enter  profile name::");
				String name=sc.next();
				System.out.println("enter profile  phone number");
				long mobileNo=sc.nextLong();
				System.out.println("enter profile photoPath::");
				String photoPath=sc.next();
				System.out.println("enter profile resumePath::");
				String resumePath=sc.next();
				//get byte[]  from the photo file
				FileInputStream  fis=new FileInputStream(photoPath);
				byte[] photoContent=new byte[fis.available()];
				photoContent=fis.readAllBytes();
				
				// get char[]  from  text file
				File file=new File(resumePath);
				FileReader reader=new FileReader(file);
				char[] resumeContent=new char[(int)file.length()];
				reader.read(resumeContent);
				//create Profile object
				MarriageProfile profile=new MarriageProfile(name, mobileNo, photoContent, resumeContent);
				try {
					String msg=profileService.registerMarriageProfile(profile);
					System.out.println(msg);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
		*/		
		
		Optional<MarriageProfile> opt=profileService.showProfileById(102);
		if(opt.isPresent()) {
			System.out.println("Marriage Profile::");
			MarriageProfile profile=opt.get();
			System.out.println(profile.getPid()+"  "+profile.getName()+"  "+profile.getMobileNo());
			byte[] photoContext=profile.getPhoto();
			char[]  resumeContent=profile.getResume();
			FileOutputStream fos=new FileOutputStream("retrive_photo.jpg");
			fos.write(photoContext);
			fos.flush(); fos.close();
			FileWriter writer=new FileWriter("retreive_resume.txt");
			writer.write(resumeContent);
			writer.flush();writer.close();
			System.out.println("photo and resume files are retrived");
			
		}
		else {
			System.out.println("profile not found");
		}
		
		

	}

}
