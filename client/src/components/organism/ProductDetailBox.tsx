import ProductImg from '../atom/ProductImg';
import ProductInfoArea from '../organism/ProductInfoArea';
import Box from '../atom/Box';

const products = [
  {
    productId: 1,
    productName: '손선풍기',
    detail: '작은 크기의 손선풍기! 가벼워서 외출할 때 들고가기 좋아요!!!',
    mainImg: 'https://sitem.ssgcdn.com/91/71/69/item/1000543697191_i1_1100.jpg',
    categoryName: '생활잡화',
    tagNames: ['귀여움', '가벼움'],
    likes: 2,
  },
];

const ProductDetailBox = (productId: number) => {
  return (
    <Box style={boxStyle}>
      <ProductImg src={products[productId].mainImg} />
      <ProductInfoArea
        categoryName={products[productId].categoryName}
        productName={products[productId].productName}
        tagNames={products[productId].tagNames}
      />
    </Box>
  );
};

const boxStyle = {
  display: 'flex',
  justifyContent: 'space-between',
};

export default ProductDetailBox;
