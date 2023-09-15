Character classes trong biểu thức chính quy (regular expressions hoặc regex) là các tập hợp các ký tự mà bạn muốn so khớp trong chuỗi văn bản. Character classes cho phép bạn chỉ định một nhóm ký tự cụ thể mà bạn muốn tìm kiếm trong chuỗi. Dưới đây là một số cách sử dụng character classes trong regex:

1. Dãy ký tự đơn: Bạn có thể chỉ định một ký tự cụ thể để tìm kiếm. Ví dụ: a so khớp với ký tự "a".

2. Dãy ký tự trong khoảng: Bạn có thể xác định một khoảng các ký tự bằng cách sử dụng dấu gạch nối -. Ví dụ: [a-z] so khớp với bất kỳ ký tự nào từ "a" đến "z".

3. Dãy ký tự phủ định: Bạn có thể sử dụng ^ ở đầu một character class để chỉ định dãy ký tự không muốn so khớp. Ví dụ: [^0-9] so khớp với bất kỳ ký tự nào không phải là số.

4. Sử dụng ký tự thoát (escape): Nếu bạn muốn tìm kiếm ký tự đặc biệt như [, ], ^, bạn cần sử dụng \ trước chúng. Ví dụ: \[ so khớp với dấu [.

5. Ký tự thoát đặc biệt trong character class: Một số ký tự đặc biệt như ^, -, ] không cần escape khi được sử dụng bên trong một character class.

# Dưới đây là một số ví dụ về cách sử dụng character classes trong regex:

- [abc]: So khớp với một trong các ký tự "a", "b", hoặc "c".
- [a-z]: So khớp với bất kỳ ký tự chữ cái từ "a" đến "z".
- [A-Za-z]: So khớp với bất kỳ ký tự chữ cái hoa hoặc thường.
- [0-9]: So khớp với bất kỳ chữ số nào.
- [^0-9]: So khớp với bất kỳ ký tự nào không phải là số.

Character classes cho phép bạn xác định các tập hợp phức tạp hơn của ký tự mà bạn muốn tìm kiếm trong chuỗi văn bản và là một phần quan trọng của regex để xác định các mẫu phức tạp.
