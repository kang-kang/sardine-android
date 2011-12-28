package cn.lzu.edu.webdav;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.googlecode.sardine.DavResource;
import com.googlecode.sardine.Sardine;
import com.googlecode.sardine.SardineFactory;

import android.app.Activity;
import android.os.Bundle;

public class SardineActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Sardine sardine = SardineFactory.begin("", "");
		 List<DavResource> resources;
		try {
			 resources = sardine.list("http://yourserver/");
			 for (DavResource res : resources)
			 {
			 System.out.println("Res: " + res);
			 }
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
