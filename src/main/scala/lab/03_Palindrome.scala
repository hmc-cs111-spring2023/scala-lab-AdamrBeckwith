/** 
  *  True if the string with all spaces and punctuation removed is a palindrome
  *  
  *  Hint: the Scala collections API is your friend
  *  https://docs.scala-lang.org/overviews/scala-book/collections-methods.html
  */
def isPalindrome(s: String): Boolean = 
  if (s.size) == 0 then return true
  else 
    if s.head.toString() == s.tail.toString() 
    then s.remove(s.head).remove(s.tail)
      else false 
