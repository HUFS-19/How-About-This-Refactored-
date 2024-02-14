import LayoutTemplate from '../template/LayoutTemplate';
import ProductDetailBox from '../organism/ProductDetailBox';
import CommentBox from '../organism/CommentBox';

const ProductDetailPage = () => {
  // productId 가져오는 axios 코드 작성 예정
  const productId = 0;

  return (
    <LayoutTemplate
      children={[ProductDetailBox(productId), CommentBox(productId)]}
    />
  );
};

export default ProductDetailPage;
