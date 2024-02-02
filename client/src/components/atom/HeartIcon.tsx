import styled from 'styled-components';

import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faHeart } from '@fortawesome/free-solid-svg-icons';

const HeartIcon = () => {
  return <StyledHeartIcon icon={faHeart} />;
};

const StyledHeartIcon = styled(FontAwesomeIcon)`
  position: absolute;
  bottom: 63px;
  right: 10px;
  font-size: 25px;
  color: #ececec;
`;

export default HeartIcon;
