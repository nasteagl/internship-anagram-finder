
### How to Build and Run the Program
#### Step 1: Get the Project
Clone or download the repository:

```bash
git clone https://github.com/your-username/internship-anagram-finder.git

cd internship-anagram-finder
```
### Option 1: If You Have an IDE (IntelliJ IDEA, VS Code, Eclipse,etc.)
- Open your IDE and open the project folder.
  If your IDE supports Maven, it will detect the project automatically.

- Build the project using the IDE’s build tools.

- Run the Main class (org.anagrams.Main) and provide the input file path (e.g., sample.txt) as a program argument.

- View the output in the IDE’s console.

### Option 2: If You Have Maven but No IDE
- Open a terminal in the project root directory (where pom.xml is located).

Build the project:

```bash
mvn clean package
```
Run the program with:

```bash
java -cp target/internship-anagram-finder-1.0-SNAPSHOT.jar org.anagrams.Main sample.txt
```

### Option 3: If You Have No IDE or Maven (Manual Compilation)
- Open a terminal in the project root directory.

Compile Java source files manually:

```bash
javac -d out -sourcepath src/main/java src/main/java/org/anagrams/*.java
```
Run the program with:

```bash
java -cp out org.anagrams.Main sample.txt
```

