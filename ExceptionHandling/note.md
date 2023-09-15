# What is an Exception in Java?

Trong Java, một exception (ngoại lệ) là một sự kiện hoặc tình huống không mong muốn xảy ra trong quá trình thực thi chương trình. Exception xảy ra khi một phương thức không thể hoàn thành công việc của nó hoặc khi một điều kiện bất thường xảy ra trong quá trình thực thi. Exceptions giúp quản lý và báo cáo về các lỗi hoặc tình huống ngoại lệ trong chương trình.

# Error vs Exception in Java

1. Exception:
   Exception là một loại sự kiện ngoại lệ xảy ra trong quá trình thực thi chương trình, nhưng nó thường được dự đoán và kiểm soát được.
   Exception có hai loại chính: Checked Exception (Exception kiểm tra) và Unchecked Exception (Runtime Exception).
   Checked Exception: Phải được xử lý bằng cách sử dụng khối try-catch hoặc khai báo trong danh sách ngoại lệ (throws) của phương thức. Ví dụ: IOException.
   Unchecked Exception (Runtime Exception): Không yêu cầu phải xử lý ngay lập tức. Ví dụ: NullPointerException, ArrayIndexOutOfBoundsException.

2. Error:
   Error là một loại ngoại lệ cũng xảy ra trong quá trình thực thi, nhưng chúng thường là các tình huống ngoại lệ mà lập trình viên không nên hoặc không cần xử lý, vì chúng đại diện cho các vấn đề nghiêm trọng hơn và thường không thể khắc phục.
   Error không nên được xử lý hoặc bắt trong chương trình Java thông thường.
   Một số ví dụ về Error bao gồm OutOfMemoryError (khi hết bộ nhớ) và StackOverflowError (khi stack gọi đệ quy quá sâu).
   Về cơ bản, sự khác biệt quan trọng giữa Exception và Error là Exception thường là các vấn đề lập trình hoặc các tình huống ngoại lệ dự đoán được mà bạn có thể và nên xử lý, trong khi Error thường là các vấn đề không thể kiểm soát hoặc sự cố nghiêm trọng hơn, và bạn không nên thử xử lý chúng trong chương trình của mình.

# Checked and Unchecked Exceptions in Java

1. Checked Exceptions (Exceptions kiểm tra):

Checked Exceptions là các exceptions mà trình biên dịch yêu cầu bạn phải xử lý (handle) bằng cách sử dụng khối try-catch hoặc khai báo chúng trong danh sách ngoại lệ (throws) của phương thức.
Chúng thường xảy ra trong các tình huống có thể được dự đoán và kiểm soát, chẳng hạn như đọc/ghi tệp tin hoặc kết nối mạng.
Checked Exceptions thường là các lớp con của lớp Exception hoặc các lớp con của lớp IOException.

2. Unchecked Exceptions (Runtime Exceptions):

Unchecked Exceptions là các exceptions không yêu cầu bạn phải xử lý ngay lập tức. Chúng thường xảy ra trong các tình huống không thể kiểm soát được, chẳng hạn như chia cho 0 hoặc truy cập phần tử không tồn tại trong mảng.
Unchecked Exceptions thường là các lớp con của lớp RuntimeException.
