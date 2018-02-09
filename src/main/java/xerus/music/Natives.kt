package xerus.music

import xerus.ktutil.findFolder
import java.io.File

abstract class Natives {
	
	protected abstract fun showNativeFileChooser(title: String, origin: File, extension: String): File?
	
	companion object {
		
		val instance = Class.forName("xerus.music.Native").newInstance() as Natives
		
		fun showFileChooser(title: String, origin: String, extension: String) =
				instance.showNativeFileChooser(title, findFolder(File(origin)), extension)
	}
	
}