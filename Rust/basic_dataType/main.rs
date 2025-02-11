/*
    Rust 学习  2024.11.20
*/
fn main() {
    // const 常量
    const PI: f32 = std::f32::consts::PI;
    println!("PI = {}", PI);

    const TAU: f64 = (PI * 2.0) as f64;
    println!("TAU = {}", TAU);

    let x: char = 'A';
    println!("x = {}", x);

    let x = 3;
    println!("x = {}", x);

    let x: u32 = 3;
    println!("x = {}", x);

    // 数组
    let arr: [i32; 2] = [1, 2];
    println!("arr = {:?}", arr);

    // 元组
    let a: (i32, i32) = (1, 2);
    println!("a = {:?}", a);
}