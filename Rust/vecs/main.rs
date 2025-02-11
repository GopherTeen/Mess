/*
    Rust 学习  2024.11.25
*/

fn main() {
    let v: Vec<u32> = Vec::new();
    println!("{:?}", v);

    let mut v = vec![1, 2, 3, 4, 5];
    let third: &i32 = &v[2];
    println!("The third element is {}", third);

    let third: Option<&i32> = v.get(5);
    match third {
        Some(third) => println!("The third element is {}", third),
        None => println!("There is no third element."),
    }

    // 所有权与引用
    let first = &v[0];
    // v.push(5); // 不允许的操作
    println!("The first element is {first}");

    for i in &mut v {
        *i *= 2;
    }
    for i in &v {
        println!("{i}");
    }
}