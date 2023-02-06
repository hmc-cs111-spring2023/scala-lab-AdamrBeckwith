/** 
  *  True if the string with all spaces and punctuation removed is a palindrome
  *  
  *  Hint: the Scala collections API is your friend
  *  https://docs.scala-lang.org/overviews/scala-book/collections-methods.html
  */
def isPalindrome(s: String): Boolean = 
  if (String.size) == 0 then return true
  else 
    if String.head() == String.tail() then true 
      else false 
