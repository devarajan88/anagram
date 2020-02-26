***************  Anagram  **************

It is a simple java program.

1. Please unzip file
2. Import the project into IDE (e.g. Eclipse, IntelliJ IDEA)
3. Can input more words in sample.txt in the source directory
4. Open AnagramGenerator.java file and run as a Java Application.
5. Check the output in IDE Console.


This program uses simple logic and no uses the external library.

This program can be enhanced further to list out the meaningful words using WordNet  or other sources as well.
Due to time constraint and readability, I just ignored that task for the moment. I can enhance this feature if I am asked so.

/** public static String checkInDictionary(String s) throws IOException {
        String wnhome = System.getenv(" WNHOME ");
        String path = wnhome + File.separator + " dict ";
        URL url = new URL(" f ", null, path);

        // construct the dictionary object and open it
        IDictionary dict = new Dictionary(url);
        dict.open();

        // look up first sense of the word "dog "
        IIndexWord idxWord = dict.getIndexWord(s, POS.NOUN);
        IWordID wordID = idxWord.getWordIDs().get(0);
        IWord word = dict.getWord(wordID);
        System.out.println(" Lemma = " + word.getLemma());

        return word.getLemma();
    } **/

Earlier, I used Stream API to process the file which gives more performance. Later, I switched to simple solution.

            /**  String fileName = "c://lines.txt";

     		//read file into stream, try-with-resources
     		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

     			stream.forEach(System.out::println);

     		} catch (IOException e) {
     			e.printStackTrace();
     		}   **/


****************   END    ***************

