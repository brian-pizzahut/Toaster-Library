package pizzahut.com.toasterlibrary

import android.content.Context
import android.widget.Toast

/**
 * @author Brian
 * @date: 12/10/18
 */


class ToasterMessage {

    companion object {

        fun toast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}