package ninja.androiddev.customfontwidgets.views;

import ninja.androiddev.customfontwidgets.utils.CustomFontUtils;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

public class CustomFontCheckedTextView extends CheckedTextView {

	public CustomFontCheckedTextView(Context context, AttributeSet attrs,
			int defStyle) {
		super(context, attrs, defStyle);
		init(context, attrs);
	}
	
	public CustomFontCheckedTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context, attrs);
	}
	
	public CustomFontCheckedTextView(Context context) {
		super(context);
		
	}
	
	void init(Context context, AttributeSet attrs)
	{
		if(!isInEditMode())
		{
			CustomFontUtils.setTypeFace(context, attrs, this);
		}
	}
	
}
