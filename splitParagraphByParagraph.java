      
      
      \r will goto starting of the line
      \n will go to next line
      
      
      String[] splittedInfo = emailContent.split("\n\n");
      if (splittedInfo == null || (splittedInfo != null && (splittedInfo.length == 0 || splittedInfo.length == 1))) {
        splittedInfo = emailContent.split("\r\r");
        if (splittedInfo == null || (splittedInfo != null && (splittedInfo.length == 0 || splittedInfo.length == 1))) {
          splittedInfo = emailContent.split("\r\n\r\n");
        }
      }
      
      for (String emailContentString : splittedInfo) {
        if (emailContentString.contains(reasonForBounce)) {
//          ZoniacLogger.getLogger().info(emailContentString);
          retTypeEmailContentString = emailContentString;
          break;
        }
      }
