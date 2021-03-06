/** 
 ** Copyright (c) 2010 Ushahidi Inc
 ** All rights reserved
 ** Contact: team@ushahidi.com
 ** Website: http://www.ushahidi.com
 ** 
 ** GNU Lesser General Public License Usage
 ** This file may be used under the terms of the GNU Lesser
 ** General Public License version 3 as published by the Free Software
 ** Foundation and appearing in the file LICENSE.LGPL included in the
 ** packaging of this file. Please review the following information to
 ** ensure the GNU Lesser General Public License version 3 requirements
 ** will be met: http://www.gnu.org/licenses/lgpl.html.	
 **	
 **
 ** If you have questions regarding the use of this file, please contact
 ** Ushahidi developers at team@ushahidi.com.
 ** 
 **/

package org.addhen.smssync;

import android.net.Uri;
import android.provider.BaseColumns;

public final class SmsSync {
	
	public static final String AUTHORITY = "org.addhen.smssync.data.SmsSync";

    // This class cannot be instantiated
    private SmsSync() {}
	
	// smssync outbox table
	public static final class SmssyncMsgs implements BaseColumns {
		
		public static final Uri CONTENT_URI = Uri.parse("content://"+AUTHORITY+"smssync_msgs");
		
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.smsync.smssync_msg";

        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.smsync.smssync_msg";
		
		// column names
		public static final String MESSAGE_BODY = "message_body";
		public static final String MESSAGE_FROM = "message_from";
		public static final String IS_MESSAGE_SENT = "is_sent";
		public static final String CREATED_DATE = "created";
		
		public static final String SMSSYNC_MSG = "smssyn_msg";
		
		public static final String DEFAULT_SORT_ORDER = "created DESC";
	}
}
