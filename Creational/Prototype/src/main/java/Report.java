import java.util.ArrayList;
import java.util.List;

public class Report implements Prototype<Report>
{

    private String title;
    private String author;
    private List<String> sections;

    public Report(String title, String author, List<String> sections)
    {
        this.title = title;
        this.author = author;
        this.sections = sections;
    }

    // Another way
    public Report(Report other) {

        this.title = other.title;
        this.author = other.author;
        this.sections = new ArrayList<>(other.sections);
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public List<String> getSections()
    {
        return sections;
    }

    @Override
    public Report clone()
    {
        return new Report(
          this.title,
          this.author,
          // to not affect the original
          new ArrayList<>(this.sections)
        );
    }
}
//Shallow Copy vs Deep Copy

//Shallow copy
//Copies the object but references nested objects:
//
//Original
// └── sections ──────┐
//  ↓
//List A
//                    ↑
//Copy
// └── sections ──────┘
//
//Both share List A. (mutable by both objects as they both refer to the same list)

//Deep copy
//Copies the nested mutable objects too:
//
//Original
// └── sections → List A
//
//
//Copy
// └── sections → List B
//
//Now they are independent.