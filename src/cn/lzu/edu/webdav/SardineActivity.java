package cn.lzu.edu.webdav;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import com.googlecode.sardine.DavResource;
import com.googlecode.sardine.Sardine;
import com.googlecode.sardine.SardineFactory;
import com.googlecode.sardine.model.Multistatus;
import com.googlecode.sardine.model.Response;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SardineActivity extends Activity {
	private String ROOT = "http://yourserver/";
	private String TAG = "Sardine";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
/*
		Sardine sardine = SardineFactory.begin("foo", "bar");
		List<DavResource> resources;
		try {
			resources = sardine.list(ROOT);
			for (DavResource res : resources) {
				System.out.println("Res: " + res);
			}
			InputStream fis = new FileInputStream(new File(
					"/mnt/sdcard/sardine/fileToUpload.png"));
			sardine.put(ROOT + "path/to/nameOfFile.png", fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
*/
		Serializer serializer = new Persister();

		// deserializer
		try {
			InputStream source = getAssets().open("ms.xml");
			Multistatus multistatus = serializer.read(Multistatus.class,
					source, false);
			Log.i(TAG, "Read multistatus " + multistatus.toString());
			for (Response res : multistatus.getResponse()) {
				Log.i(TAG, "Response " + res.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}